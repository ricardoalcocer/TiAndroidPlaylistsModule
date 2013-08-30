/* C++ code produced by gperf version 3.0.3 */
/* Command-line: gperf -L C++ -E -t /private/var/folders/zs/2vsy8lqj1hzckz7rhwprb5wh0000gp/T/ralcocer/modandroidplaylists-generated/KrollGeneratedBindings.gperf  */
/* Computed positions: -k'' */

#line 3 "/private/var/folders/zs/2vsy8lqj1hzckz7rhwprb5wh0000gp/T/ralcocer/modandroidplaylists-generated/KrollGeneratedBindings.gperf"


#include <string.h>
#include <v8.h>
#include <KrollBindings.h>

#include "com.alcoapps.androidplaylists.ExampleProxy.h"
#include "com.alcoapps.androidplaylists.ModandroidplaylistsModule.h"


#line 14 "/private/var/folders/zs/2vsy8lqj1hzckz7rhwprb5wh0000gp/T/ralcocer/modandroidplaylists-generated/KrollGeneratedBindings.gperf"
struct titanium::bindings::BindEntry;
/* maximum key range = 14, duplicates = 0 */

class ModandroidplaylistsBindings
{
private:
  static inline unsigned int hash (const char *str, unsigned int len);
public:
  static struct titanium::bindings::BindEntry *lookupGeneratedInit (const char *str, unsigned int len);
};

inline /*ARGSUSED*/
unsigned int
ModandroidplaylistsBindings::hash (register const char *str, register unsigned int len)
{
  return len;
}

struct titanium::bindings::BindEntry *
ModandroidplaylistsBindings::lookupGeneratedInit (register const char *str, register unsigned int len)
{
  enum
    {
      TOTAL_KEYWORDS = 2,
      MIN_WORD_LENGTH = 42,
      MAX_WORD_LENGTH = 55,
      MIN_HASH_VALUE = 42,
      MAX_HASH_VALUE = 55
    };

  static struct titanium::bindings::BindEntry wordlist[] =
    {
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""}, {""}, {""}, {""},
#line 16 "/private/var/folders/zs/2vsy8lqj1hzckz7rhwprb5wh0000gp/T/ralcocer/modandroidplaylists-generated/KrollGeneratedBindings.gperf"
      {"com.alcoapps.androidplaylists.ExampleProxy", ::com::alcoapps::androidplaylists::modandroidplaylists::ExampleProxy::bindProxy, ::com::alcoapps::androidplaylists::modandroidplaylists::ExampleProxy::dispose},
      {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""}, {""},
      {""}, {""}, {""},
#line 17 "/private/var/folders/zs/2vsy8lqj1hzckz7rhwprb5wh0000gp/T/ralcocer/modandroidplaylists-generated/KrollGeneratedBindings.gperf"
      {"com.alcoapps.androidplaylists.ModandroidplaylistsModule", ::com::alcoapps::androidplaylists::ModandroidplaylistsModule::bindProxy, ::com::alcoapps::androidplaylists::ModandroidplaylistsModule::dispose}
    };

  if (len <= MAX_WORD_LENGTH && len >= MIN_WORD_LENGTH)
    {
      register int key = hash (str, len);

      if (key <= MAX_HASH_VALUE && key >= 0)
        {
          register const char *s = wordlist[key].name;

          if (*str == *s && !strcmp (str + 1, s + 1))
            return &wordlist[key];
        }
    }
  return 0;
}
#line 18 "/private/var/folders/zs/2vsy8lqj1hzckz7rhwprb5wh0000gp/T/ralcocer/modandroidplaylists-generated/KrollGeneratedBindings.gperf"

